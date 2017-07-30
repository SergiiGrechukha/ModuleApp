package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass857 {

    @Ignore    private SampleClass858 sampleClass;

    public SampleClass857(){
        sampleClass = new SampleClass858();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}