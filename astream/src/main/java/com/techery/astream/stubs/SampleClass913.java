package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass913 {

    @Ignore    private SampleClass914 sampleClass;

    public SampleClass913(){
        sampleClass = new SampleClass914();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}