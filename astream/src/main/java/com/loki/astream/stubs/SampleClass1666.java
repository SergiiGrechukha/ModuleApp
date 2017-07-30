package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1666 {

    @Ignore    private SampleClass1667 sampleClass;

    public SampleClass1666(){
        sampleClass = new SampleClass1667();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}