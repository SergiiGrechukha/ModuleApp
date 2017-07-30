package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1468 {

    @Ignore    private SampleClass1469 sampleClass;

    public SampleClass1468(){
        sampleClass = new SampleClass1469();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}