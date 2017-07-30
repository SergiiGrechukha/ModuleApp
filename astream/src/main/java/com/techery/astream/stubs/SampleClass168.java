package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass168 {

    @Ignore    private SampleClass169 sampleClass;

    public SampleClass168(){
        sampleClass = new SampleClass169();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}