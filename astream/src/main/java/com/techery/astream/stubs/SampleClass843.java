package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass843 {

    @Ignore    private SampleClass844 sampleClass;

    public SampleClass843(){
        sampleClass = new SampleClass844();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}