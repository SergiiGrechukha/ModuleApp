package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1191 {

    @Ignore    private SampleClass1192 sampleClass;

    public SampleClass1191(){
        sampleClass = new SampleClass1192();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}