package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass700 {

    @Ignore    private SampleClass701 sampleClass;

    public SampleClass700(){
        sampleClass = new SampleClass701();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}