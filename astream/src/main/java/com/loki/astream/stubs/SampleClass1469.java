package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1469 {

    @Ignore    private SampleClass1470 sampleClass;

    public SampleClass1469(){
        sampleClass = new SampleClass1470();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}