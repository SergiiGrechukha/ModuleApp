package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass792 {

    @Ignore    private SampleClass793 sampleClass;

    public SampleClass792(){
        sampleClass = new SampleClass793();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}