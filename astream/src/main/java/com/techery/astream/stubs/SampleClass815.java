package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass815 {

    @Ignore    private SampleClass816 sampleClass;

    public SampleClass815(){
        sampleClass = new SampleClass816();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}