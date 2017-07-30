package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1427 {

    @Ignore    private SampleClass1428 sampleClass;

    public SampleClass1427(){
        sampleClass = new SampleClass1428();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}