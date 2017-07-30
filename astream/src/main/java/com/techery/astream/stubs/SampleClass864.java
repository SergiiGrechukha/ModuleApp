package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass864 {

    @Ignore    private SampleClass865 sampleClass;

    public SampleClass864(){
        sampleClass = new SampleClass865();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}