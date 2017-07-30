package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1219 {

    @Ignore    private SampleClass1220 sampleClass;

    public SampleClass1219(){
        sampleClass = new SampleClass1220();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}