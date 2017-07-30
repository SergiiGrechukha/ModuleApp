package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass973 {

    @Ignore    private SampleClass974 sampleClass;

    public SampleClass973(){
        sampleClass = new SampleClass974();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}