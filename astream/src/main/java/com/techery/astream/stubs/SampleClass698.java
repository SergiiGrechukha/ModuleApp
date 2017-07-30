package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass698 {

    @Ignore    private SampleClass699 sampleClass;

    public SampleClass698(){
        sampleClass = new SampleClass699();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}