package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1976 {

    @Ignore    private SampleClass1977 sampleClass;

    public SampleClass1976(){
        sampleClass = new SampleClass1977();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}