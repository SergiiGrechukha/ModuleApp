package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass395 {

    @Ignore    private SampleClass396 sampleClass;

    public SampleClass395(){
        sampleClass = new SampleClass396();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}