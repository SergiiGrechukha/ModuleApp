package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1209 {

    @Ignore    private SampleClass1210 sampleClass;

    public SampleClass1209(){
        sampleClass = new SampleClass1210();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}