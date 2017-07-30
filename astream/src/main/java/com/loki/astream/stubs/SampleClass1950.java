package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1950 {

    @Ignore    private SampleClass1951 sampleClass;

    public SampleClass1950(){
        sampleClass = new SampleClass1951();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}