package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1030 {

    @Ignore    private SampleClass1031 sampleClass;

    public SampleClass1030(){
        sampleClass = new SampleClass1031();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}