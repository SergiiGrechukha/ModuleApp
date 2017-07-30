package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1376 {

    @Ignore    private SampleClass1377 sampleClass;

    public SampleClass1376(){
        sampleClass = new SampleClass1377();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}