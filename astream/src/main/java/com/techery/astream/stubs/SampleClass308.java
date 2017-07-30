package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass308 {

    @Ignore    private SampleClass309 sampleClass;

    public SampleClass308(){
        sampleClass = new SampleClass309();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}