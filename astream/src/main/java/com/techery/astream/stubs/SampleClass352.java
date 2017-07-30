package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass352 {

    @Ignore    private SampleClass353 sampleClass;

    public SampleClass352(){
        sampleClass = new SampleClass353();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}