package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1051 {

    @Ignore    private SampleClass1052 sampleClass;

    public SampleClass1051(){
        sampleClass = new SampleClass1052();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}