package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass424 {

    @Ignore    private SampleClass425 sampleClass;

    public SampleClass424(){
        sampleClass = new SampleClass425();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}