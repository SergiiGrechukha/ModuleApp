package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass809 {

    @Ignore    private SampleClass810 sampleClass;

    public SampleClass809(){
        sampleClass = new SampleClass810();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}