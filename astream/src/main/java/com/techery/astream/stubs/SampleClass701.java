package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass701 {

    @Ignore    private SampleClass702 sampleClass;

    public SampleClass701(){
        sampleClass = new SampleClass702();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}