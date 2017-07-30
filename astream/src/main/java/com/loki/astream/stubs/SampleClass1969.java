package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1969 {

    @Ignore    private SampleClass1970 sampleClass;

    public SampleClass1969(){
        sampleClass = new SampleClass1970();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}