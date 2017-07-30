package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1974 {

    @Ignore    private SampleClass1975 sampleClass;

    public SampleClass1974(){
        sampleClass = new SampleClass1975();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}