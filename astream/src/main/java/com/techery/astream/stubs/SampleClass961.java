package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass961 {

    @Ignore    private SampleClass962 sampleClass;

    public SampleClass961(){
        sampleClass = new SampleClass962();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}