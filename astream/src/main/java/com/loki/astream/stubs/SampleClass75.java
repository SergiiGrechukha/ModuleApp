package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass75 {

    @Ignore    private SampleClass76 sampleClass;

    public SampleClass75(){
        sampleClass = new SampleClass76();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}