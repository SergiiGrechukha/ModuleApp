package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1190 {

    @Ignore    private SampleClass1191 sampleClass;

    public SampleClass1190(){
        sampleClass = new SampleClass1191();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}