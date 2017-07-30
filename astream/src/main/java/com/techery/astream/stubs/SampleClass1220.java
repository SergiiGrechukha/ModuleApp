package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1220 {

    @Ignore    private SampleClass1221 sampleClass;

    public SampleClass1220(){
        sampleClass = new SampleClass1221();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}