package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass704 {

    @Ignore    private SampleClass705 sampleClass;

    public SampleClass704(){
        sampleClass = new SampleClass705();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}