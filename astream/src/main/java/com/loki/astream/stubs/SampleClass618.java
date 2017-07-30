package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass618 {

    @Ignore    private SampleClass619 sampleClass;

    public SampleClass618(){
        sampleClass = new SampleClass619();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}