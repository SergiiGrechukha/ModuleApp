package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass875 {

    @Ignore    private SampleClass876 sampleClass;

    public SampleClass875(){
        sampleClass = new SampleClass876();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}