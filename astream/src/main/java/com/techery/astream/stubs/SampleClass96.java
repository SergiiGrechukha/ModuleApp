package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass96 {

    @Ignore    private SampleClass97 sampleClass;

    public SampleClass96(){
        sampleClass = new SampleClass97();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}