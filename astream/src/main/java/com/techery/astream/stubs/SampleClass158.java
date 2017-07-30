package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass158 {

    @Ignore    private SampleClass159 sampleClass;

    public SampleClass158(){
        sampleClass = new SampleClass159();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}