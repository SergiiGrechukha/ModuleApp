package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass697 {

    @Ignore    private SampleClass698 sampleClass;

    public SampleClass697(){
        sampleClass = new SampleClass698();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}