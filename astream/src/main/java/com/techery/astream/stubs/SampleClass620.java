package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass620 {

    @Ignore    private SampleClass621 sampleClass;

    public SampleClass620(){
        sampleClass = new SampleClass621();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}