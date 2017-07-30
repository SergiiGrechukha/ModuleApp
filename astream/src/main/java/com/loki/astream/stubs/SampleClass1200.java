package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1200 {

    @Ignore    private SampleClass1201 sampleClass;

    public SampleClass1200(){
        sampleClass = new SampleClass1201();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}