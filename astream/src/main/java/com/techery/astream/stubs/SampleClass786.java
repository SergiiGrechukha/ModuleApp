package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass786 {

    @Ignore    private SampleClass787 sampleClass;

    public SampleClass786(){
        sampleClass = new SampleClass787();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}