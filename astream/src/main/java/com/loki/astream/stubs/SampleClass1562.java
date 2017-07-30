package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1562 {

    @Ignore    private SampleClass1563 sampleClass;

    public SampleClass1562(){
        sampleClass = new SampleClass1563();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}